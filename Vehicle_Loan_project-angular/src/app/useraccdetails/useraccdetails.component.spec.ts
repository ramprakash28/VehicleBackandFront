import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UseraccdetailsComponent } from './useraccdetails.component';

describe('UseraccdetailsComponent', () => {
  let component: UseraccdetailsComponent;
  let fixture: ComponentFixture<UseraccdetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UseraccdetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UseraccdetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
