import { BrowserModule } from '@angular/platform-browser';
import { NgModule, InjectionToken } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DoumentViewComponent } from './document-view/document-view.component';
import { BASE_URL } from './base-url.value';
import { HttpClientModule } from '@angular/common/http';
import { VirtualScrollerModule } from 'primeng/virtualscroller';

@NgModule({
  declarations: [
    AppComponent,
    DoumentViewComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    VirtualScrollerModule,
    AppRoutingModule
  ],
  providers: [
    {provide: BASE_URL, useValue: '/api/v1'}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
