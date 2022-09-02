package com.example.abstractmyorange.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/abstractmyorange/di/MainModule;", "", "()V", "bindTariffApi", "Lcom/example/abstractmyorange/data/remote/TariffsApi;", "dataSource", "Lcom/example/abstractmyorange/data/repositories/DataSource;", "bindTariffRepo", "Lcom/example/abstractmyorange/domain/repositories/ITariffsRepo;", "tariffsRepo", "Lcom/example/abstractmyorange/data/repositories/TariffsRepo;", "app_debug"})
@dagger.Module()
public abstract class MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @ActivityScope()
    public abstract com.example.abstractmyorange.domain.repositories.ITariffsRepo bindTariffRepo(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.data.repositories.TariffsRepo tariffsRepo);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    @ActivityScope()
    public abstract com.example.abstractmyorange.data.remote.TariffsApi bindTariffApi(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.data.repositories.DataSource dataSource);
    
    public MainModule() {
        super();
    }
}