package com.example.abstractmyorange.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\fJ\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\r"}, d2 = {"Lcom/example/abstractmyorange/di/MainComponent;", "", "orderSubComponentBuilder", "Lcom/example/abstractmyorange/onboarding/di/OrderSubComponent$Builder;", "getOrderSubComponentBuilder", "()Lcom/example/abstractmyorange/onboarding/di/OrderSubComponent$Builder;", "getCostComponent", "Lcom/example/abstractmyorange/editrequst/di/CostSubComponent;", "inject", "", "appActivity", "Lcom/example/abstractmyorange/AppActivity;", "OrderComponentFactory", "app_debug"})
@dagger.Component(dependencies = {com.example.abstractmyorange.app_di.AppComponent.class}, modules = {com.example.abstractmyorange.di.MainModule.class, com.example.abstractmyorange.di.OrderingModule.class})
@ActivityScope()
public abstract interface MainComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.abstractmyorange.onboarding.di.OrderSubComponent.Builder getOrderSubComponentBuilder();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.AppActivity appActivity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.abstractmyorange.editrequst.di.CostSubComponent getCostComponent();
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/abstractmyorange/di/MainComponent$OrderComponentFactory;", "", "create", "Lcom/example/abstractmyorange/di/MainComponent;", "appComponent", "Lcom/example/abstractmyorange/app_di/AppComponent;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface OrderComponentFactory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.abstractmyorange.di.MainComponent create(@org.jetbrains.annotations.NotNull()
        com.example.abstractmyorange.app_di.AppComponent appComponent);
    }
}