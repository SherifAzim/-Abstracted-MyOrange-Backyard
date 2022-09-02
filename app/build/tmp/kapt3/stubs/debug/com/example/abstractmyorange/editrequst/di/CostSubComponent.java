package com.example.abstractmyorange.editrequst.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/abstractmyorange/editrequst/di/CostSubComponent;", "", "inject", "", "editRequestFragment", "Lcom/example/abstractmyorange/editrequst/EditRequestFragment;", "editRequestViewModel", "Lcom/example/abstractmyorange/editrequst/EditRequestViewModel;", "Lcom/example/abstractmyorange/editrequst/TariffCostFragment;", "tariffCostVM", "Lcom/example/abstractmyorange/editrequst/TariffCostVM;", "app_debug"})
@dagger.Subcomponent(modules = {com.example.abstractmyorange.editrequst.di.CostModule.class})
@CostScope()
public abstract interface CostSubComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.editrequst.EditRequestViewModel editRequestViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.editrequst.TariffCostVM tariffCostVM);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.editrequst.EditRequestFragment editRequestFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.editrequst.TariffCostFragment editRequestFragment);
}