package com.example.lktsu;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = LKApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface LKApp_GeneratedInjector {
  void injectLKApp(LKApp lKApp);
}
