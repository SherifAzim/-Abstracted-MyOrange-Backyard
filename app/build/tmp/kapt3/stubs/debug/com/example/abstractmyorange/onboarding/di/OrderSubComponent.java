package com.example.abstractmyorange.onboarding.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/abstractmyorange/onboarding/di/OrderSubComponent;", "", "inject", "", "orderVM", "Lcom/example/abstractmyorange/onboarding/OrderVM;", "Builder", "app_debug"})
@dagger.Subcomponent(modules = {com.example.abstractmyorange.onboarding.di.TariffModule.class})
@TariffScope()
public abstract interface OrderSubComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.onboarding.OrderVM orderVM);
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/example/abstractmyorange/onboarding/di/OrderSubComponent$Builder;", "", "build", "Lcom/example/abstractmyorange/onboarding/di/OrderSubComponent;", "app_debug"})
    @dagger.Subcomponent.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.abstractmyorange.onboarding.di.OrderSubComponent build();
    }
}