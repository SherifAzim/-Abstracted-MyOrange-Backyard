package com.example.abstractmyorange.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode;", "", "()V", "EMPTY_RESPONSE_ERROR", "GENERAL_ERROR", "SUCCESS", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode$SUCCESS;", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode$EMPTY_RESPONSE_ERROR;", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode$GENERAL_ERROR;", "app_debug"})
public abstract class OffersLoadingResponseCode {
    
    private OffersLoadingResponseCode() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode$SUCCESS;", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode;", "data", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;", "(Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;)V", "getData", "()Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;", "app_debug"})
    public static final class SUCCESS extends com.example.abstractmyorange.domain.usecase.OffersLoadingResponseCode {
        @org.jetbrains.annotations.NotNull()
        private final com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse data = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse getData() {
            return null;
        }
        
        public SUCCESS(@org.jetbrains.annotations.NotNull()
        com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse data) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode$EMPTY_RESPONSE_ERROR;", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode;", "errorMsg", "", "(Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "app_debug"})
    public static final class EMPTY_RESPONSE_ERROR extends com.example.abstractmyorange.domain.usecase.OffersLoadingResponseCode {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMsg = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMsg() {
            return null;
        }
        
        public EMPTY_RESPONSE_ERROR(@org.jetbrains.annotations.Nullable()
        java.lang.String errorMsg) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode$GENERAL_ERROR;", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode;", "errorMsg", "", "(Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "app_debug"})
    public static final class GENERAL_ERROR extends com.example.abstractmyorange.domain.usecase.OffersLoadingResponseCode {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMsg = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMsg() {
            return null;
        }
        
        public GENERAL_ERROR(@org.jetbrains.annotations.Nullable()
        java.lang.String errorMsg) {
            super();
        }
    }
}