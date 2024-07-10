package com.coderus.codingchallenge.adapters;

import java.lang.System;

/**
 * ListAdapter class for the Recycler view that displays a list of [RocketLaunch] objects.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0014B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016J\u001a\u0010\u0012\u001a\u00020\t2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/coderus/codingchallenge/adapters/RocketLaunchListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/coderus/codingchallenge/data/local/RocketLaunch;", "Lcom/coderus/codingchallenge/adapters/RocketLaunchListAdapter$ListItemViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "onItemClickListener", "Lkotlin/Function1;", "", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setupOnClickListener", "listener", "ListItemViewHolder", "app_debug"})
public final class RocketLaunchListAdapter extends androidx.recyclerview.widget.ListAdapter<com.coderus.codingchallenge.data.local.RocketLaunch, com.coderus.codingchallenge.adapters.RocketLaunchListAdapter.ListItemViewHolder> {
    private final android.content.Context context = null;
    private kotlin.jvm.functions.Function1<? super com.coderus.codingchallenge.data.local.RocketLaunch, kotlin.Unit> onItemClickListener;
    
    public RocketLaunchListAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.coderus.codingchallenge.adapters.RocketLaunchListAdapter.ListItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.coderus.codingchallenge.adapters.RocketLaunchListAdapter.ListItemViewHolder holder, int position) {
    }
    
    public final void setupOnClickListener(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.coderus.codingchallenge.data.local.RocketLaunch, kotlin.Unit> listener) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/coderus/codingchallenge/adapters/RocketLaunchListAdapter$ListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "listItemView", "Lcom/coderus/codingchallenge/presentation/fragments/rocketlaunchlist/ListItemView;", "(Lcom/coderus/codingchallenge/adapters/RocketLaunchListAdapter;Lcom/coderus/codingchallenge/presentation/fragments/rocketlaunchlist/ListItemView;)V", "getListItemView", "()Lcom/coderus/codingchallenge/presentation/fragments/rocketlaunchlist/ListItemView;", "app_debug"})
    public final class ListItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.ListItemView listItemView = null;
        
        public ListItemViewHolder(@org.jetbrains.annotations.NotNull
        com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.ListItemView listItemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.ListItemView getListItemView() {
            return null;
        }
    }
}