package com.example.abstractmyorange.domain.entities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014JN\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010\u00a8\u0006)"}, d2 = {"Lcom/example/abstractmyorange/domain/entities/OfferItem;", "", "offerId", "", "amount", "unit", "", "isSelected", "", "artWork", "cost", "", "(IILjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;)V", "getAmount", "()I", "getArtWork", "()Ljava/lang/String;", "setArtWork", "(Ljava/lang/String;)V", "getCost", "()Ljava/lang/Double;", "setCost", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "()Z", "setSelected", "(Z)V", "getOfferId", "getUnit", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(IILjava/lang/String;ZLjava/lang/String;Ljava/lang/Double;)Lcom/example/abstractmyorange/domain/entities/OfferItem;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class OfferItem {
    @com.google.gson.annotations.SerializedName(value = "OfferId")
    private final int offerId = 0;
    @com.google.gson.annotations.SerializedName(value = "Amount")
    private final int amount = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Unit")
    private final java.lang.String unit = null;
    private boolean isSelected;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Artwork")
    private java.lang.String artWork;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Cost")
    private java.lang.Double cost;
    
    public final int getOfferId() {
        return 0;
    }
    
    public final int getAmount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnit() {
        return null;
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getArtWork() {
        return null;
    }
    
    public final void setArtWork(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCost() {
        return null;
    }
    
    public final void setCost(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public OfferItem(int offerId, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String unit, boolean isSelected, @org.jetbrains.annotations.Nullable()
    java.lang.String artWork, @org.jetbrains.annotations.Nullable()
    java.lang.Double cost) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.abstractmyorange.domain.entities.OfferItem copy(int offerId, int amount, @org.jetbrains.annotations.NotNull()
    java.lang.String unit, boolean isSelected, @org.jetbrains.annotations.Nullable()
    java.lang.String artWork, @org.jetbrains.annotations.Nullable()
    java.lang.Double cost) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}