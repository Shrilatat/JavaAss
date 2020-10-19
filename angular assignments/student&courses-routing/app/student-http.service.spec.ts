import { TestBed, inject } from '@angular/core/testing';

import { StudentHttpService } from './student-http.service';

describe('StudentHttpService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [StudentHttpService]
    });
  });

  it('should be created', inject([StudentHttpService], (service: StudentHttpService) => {
    expect(service).toBeTruthy();
  }));
});
