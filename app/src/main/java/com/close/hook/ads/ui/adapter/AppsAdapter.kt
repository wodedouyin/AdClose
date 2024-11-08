package com.close.hook.ads.ui.adapter

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.close.hook.ads.R
import com.close.hook.ads.data.model.AppInfo
import com.close.hook.ads.databinding.InstallsItemAppBinding

class AppsAdapter(
    context: Context,
    private val onItemClickListener: OnItemClickListener
) : ListAdapter<AppInfo, AppsAdapter.AppViewHolder>(DIFF_CALLBACK) {

    private val requestOptions = RequestOptions()
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .override(context.resources.getDimensionPixelSize(R.dimen.app_icon_size))

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val binding =
            InstallsItemAppBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AppViewHolder(binding, onItemClickListener, requestOptions)
    }

    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onViewRecycled(holder: AppViewHolder) {
        val context = holder.binding.appIcon.context
        if (context is Activity && !context.isDestroyed) {
            holder.clearImage()
        }
        super.onViewRecycled(holder)
    }

    class AppViewHolder(
        val binding: InstallsItemAppBinding,
        private val onItemClickListener: OnItemClickListener,
        private val requestOptions: RequestOptions
    ) : RecyclerView.ViewHolder(binding.root) {

        private lateinit var appInfo: AppInfo

        init {
            with(binding.root) {
                setOnClickListener {
                    if (::appInfo.isInitialized) {
                        onItemClickListener.onItemClick(appInfo)
                    }
                }
                setOnLongClickListener {
                    if (::appInfo.isInitialized) {
                        onItemClickListener.onItemLongClick(appInfo)
                    }
                    true
                }
            }
        }

        fun bind(appInfo: AppInfo) {
            this.appInfo = appInfo
            with(binding) {
                appName.text = appInfo.appName
                packageName.text = appInfo.packageName
                appVersion.text = "${appInfo.versionName} (${appInfo.versionCode})"

                Glide.with(appIcon.context)
                    .load(appInfo.appIcon)
                    .apply(requestOptions)
                    .into(appIcon)
            }
        }

        fun clearImage() {
            val context = binding.appIcon.context
            if (context is Activity && !context.isDestroyed) {
                Glide.with(context).clear(binding.appIcon)
            }
        }
    }

    interface OnItemClickListener {
        fun onItemClick(appInfo: AppInfo)
        fun onItemLongClick(appInfo: AppInfo)
    }

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<AppInfo>() {
            override fun areItemsTheSame(oldItem: AppInfo, newItem: AppInfo): Boolean =
                oldItem.packageName == newItem.packageName

            override fun areContentsTheSame(oldItem: AppInfo, newItem: AppInfo): Boolean =
                oldItem.packageName == newItem.packageName &&
                oldItem.versionCode == newItem.versionCode &&
                oldItem.appName == newItem.appName &&
                oldItem.versionName == newItem.versionName
        }
    }
}
