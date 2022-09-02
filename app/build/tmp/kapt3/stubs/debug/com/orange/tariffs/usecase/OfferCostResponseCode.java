package com.orange.tariffs.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/orange/tariffs/usecase/OfferCostResponseCode;", "", "()V", "GENERAL_ERROR", "SUCCESS", "Lcom/orange/tariffs/usecase/OfferCostResponseCode$SUCCESS;", "Lcom/orange/tariffs/usecase/OfferCostResponseCode$GENERAL_ERROR;", "app_debug"})
public abstract class OfferCostResponseCode {
    
    private OfferCostResponseCode() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/orange/tariffs/usecase/OfferCostResponseCode$SUCCESS;", "Lcom/orange/tariffs/usecase/OfferCostResponseCode;", "cost", "Lcom/example/abstractmyorange/domain/entities/Cost;", "(Lcom/example/abstractmyorange/domain/entities/Cost;)V", "getCost", "()Lcom/example/abstractmyorange/domain/entities/Cost;", "app_debug"})
    public static final class SUCCESS extends com.orange.tariffs.usecase.OfferCostResponseCode {
        @org.jetbrains.annotations.NotNull()
        private final com.example.abstractmyorange.domain.entities.Cost cost = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.abstractmyorange.domain.entities.Cost getCost() {
            return null;
        }
        
        public SUCCESS(@org.jetbrains.annotations.NotNull()
        com.example.abstractmyorange.domain.entities.Cost cost) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/orange/tariffs/usecase/OfferCostResponseCode$GENERAL_ERROR;", "Lcom/orange/tariffs/usecase/OfferCostResponseCode;", "errorMsg", "", "(Ljava/lang/String;)V", "getErrorMsg", "()Ljava/lang/String;", "app_debug"})
    public static final class GENERAL_ERROR extends com.orange.tariffs.usecase.OfferCostResponseCode {
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