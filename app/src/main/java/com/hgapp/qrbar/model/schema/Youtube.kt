package com.hgapp.qrbar.model.schema

import com.hgapp.qrbar.extension.startsWithAnyIgnoreCase

class Youtube(val url: String) : Schema {

    companion object {
        private val PREFIXES = listOf("vnd.youtube://", "http://www.youtube.com", "https://www.youtube.com")

        fun parse(text: String): Youtube? {
            if (text.startsWithAnyIgnoreCase(PREFIXES).not()) {
                return null
            }
            return Youtube(text)
        }
    }

    override val schema = BarcodeSchema.YOUTUBE
    override fun toFormattedText(): String = url
    override fun toBarcodeText(): String = url
}