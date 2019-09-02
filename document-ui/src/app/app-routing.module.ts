import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DoumentViewComponent } from './document-view/document-view.component';


const routes: Routes = [
  { path: 'document-view', component: DoumentViewComponent },
  { path: '', pathMatch: 'full', redirectTo: '/document-view'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
