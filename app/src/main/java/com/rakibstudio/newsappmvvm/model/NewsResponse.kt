package com.rakibstudio.newsappmvvm.model


data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)