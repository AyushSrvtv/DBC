import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';

//Angular Material
import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatSelectModule} from '@angular/material/select';
import {MatButtonModule} from '@angular/material/button';
import {MatDividerModule} from '@angular/material/divider';
import {MatTabsModule} from '@angular/material/tabs';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatInputModule} from '@angular/material/input';
import {MatStepperModule} from '@angular/material/stepper';
import {MatSnackBarModule , MatCheckboxModule, MatIconModule } from '@angular/material';

import { SettingsComponent } from './settings/settings.component';
import { ComparePanelComponent } from './compare-panel/compare-panel.component';

@NgModule({
  declarations: [
    AppComponent,
    SettingsComponent,
    ComparePanelComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    MatTabsModule,
    MatFormFieldModule,
    MatCardModule,
    MatGridListModule,
    MatSelectModule,
    MatButtonModule,
    MatDividerModule,
    MatInputModule,
    MatSnackBarModule,
    MatCheckboxModule,
    MatIconModule,
    MatStepperModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
