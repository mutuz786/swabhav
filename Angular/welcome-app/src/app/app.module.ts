import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { StudentComponent } from './student/student.component';
import { BindingComponent } from './binding/binding.component';
import { BlueballComponent } from './blueball/blueball.component';

@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    StudentComponent,
    BindingComponent,
    BlueballComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
