import { TestBed } from '@angular/core/testing';

import { UseraccdetailsService } from './useraccdetails.service';

describe('UseraccdetailsService', () => {
  let service: UseraccdetailsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UseraccdetailsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
