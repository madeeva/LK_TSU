// Generated by Dagger (https://dagger.dev).
package com.example.lktsu;

import com.example.lktsu.repositories.RoomRepositoryImpl;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsActivity_MembersInjector implements MembersInjector<NewsActivity> {
  private final Provider<RoomRepositoryImpl> roomRepositoryImplProvider;

  public NewsActivity_MembersInjector(Provider<RoomRepositoryImpl> roomRepositoryImplProvider) {
    this.roomRepositoryImplProvider = roomRepositoryImplProvider;
  }

  public static MembersInjector<NewsActivity> create(
      Provider<RoomRepositoryImpl> roomRepositoryImplProvider) {
    return new NewsActivity_MembersInjector(roomRepositoryImplProvider);
  }

  @Override
  public void injectMembers(NewsActivity instance) {
    injectRoomRepositoryImpl(instance, roomRepositoryImplProvider.get());
  }

  @InjectedFieldSignature("com.example.lktsu.NewsActivity.roomRepositoryImpl")
  public static void injectRoomRepositoryImpl(NewsActivity instance,
      RoomRepositoryImpl roomRepositoryImpl) {
    instance.roomRepositoryImpl = roomRepositoryImpl;
  }
}
