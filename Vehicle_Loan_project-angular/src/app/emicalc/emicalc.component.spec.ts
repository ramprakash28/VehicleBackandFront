import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EMICalcComponent } from './emicalc.component';

describe('EMICalcComponent', () => {
  let component: EMICalcComponent;
  let fixture: ComponentFixture<EMICalcComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EMICalcComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EMICalcComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
