package com.retrofit1.Clients;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/retrofit1/Clients/APIClient;", "", "()V", "Companion", "app_debug"})
public final class APIClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseURL = "https://dl.dropboxusercontent.com/s/2iodh4vg0eortkl/";
    @org.jetbrains.annotations.Nullable()
    private static retrofit2.Retrofit retofit;
    public static final com.retrofit1.Clients.APIClient.Companion Companion = null;
    
    public APIClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/retrofit1/Clients/APIClient$Companion;", "", "()V", "baseURL", "", "getBaseURL", "()Ljava/lang/String;", "client", "Lretrofit2/Retrofit;", "getClient", "()Lretrofit2/Retrofit;", "retofit", "getRetofit", "setRetofit", "(Lretrofit2/Retrofit;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBaseURL() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final retrofit2.Retrofit getRetofit() {
            return null;
        }
        
        public final void setRetofit(@org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final retrofit2.Retrofit getClient() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}