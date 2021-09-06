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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<RoomRepositoryImpl> roomRepositoryImplProvider;

  public MainActivity_MembersInjector(Provider<RoomRepositoryImpl> roomRepositoryImplProvider) {
    this.roomRepositoryImplProvider = roomRepositoryImplProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<RoomRepositoryImpl> roomRepositoryImplProvider) {
    return new MainActivity_MembersInjector(roomRepositoryImplProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectRoomRepositoryImpl(instance, roomRepositoryImplProvider.get());
  }

  @InjectedFieldSignature("com.example.lktsu.MainActivity.roomRepositoryImpl")
  public static void injectRoomRepositoryImpl(MainActivity instance,
      RoomRepositoryImpl roomRepositoryImpl) {
    instance.roomRepositoryImpl = roomRepositoryImpl;
  }
}
