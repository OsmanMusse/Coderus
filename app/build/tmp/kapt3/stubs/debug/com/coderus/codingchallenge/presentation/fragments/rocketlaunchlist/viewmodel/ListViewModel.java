package com.coderus.codingchallenge.presentation.fragments.rocketlaunchlist.viewmodel;

import java.lang.System;

/**
 * ViewModel class to expose data to the ListFragment that it is required to display.
 */
@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0013\u001a\u00020\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/coderus/codingchallenge/presentation/fragments/rocketlaunchlist/viewmodel/ListViewModel;", "Landroidx/lifecycle/ViewModel;", "listRepository", "Lcom/coderus/codingchallenge/domain/repository/LauncherRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/coderus/codingchallenge/domain/repository/LauncherRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_isListLoading", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "_rocketLaunchResults", "", "Lcom/coderus/codingchallenge/data/local/RocketLaunch;", "isListLoading", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "rocketLaunchResults", "getRocketLaunchResults", "retrieveData", "", "app_debug"})
public final class ListViewModel extends androidx.lifecycle.ViewModel {
    private final com.coderus.codingchallenge.domain.repository.LauncherRepository listRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher dispatcher = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.coderus.codingchallenge.data.local.RocketLaunch>> _rocketLaunchResults = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isListLoading = null;
    
    @javax.inject.Inject
    public ListViewModel(@org.jetbrains.annotations.NotNull
    com.coderus.codingchallenge.domain.repository.LauncherRepository listRepository, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.coderus.codingchallenge.data.local.RocketLaunch>> getRocketLaunchResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isListLoading() {
        return null;
    }
    
    /**
     * Request the list of [RocketLaunch] data.
     */
    public final void retrieveData() {
    }
}