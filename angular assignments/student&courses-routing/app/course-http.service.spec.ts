import { TestBed, inject } from '@angular/core/testing';

import { CourseHttpService } from './course-http.service';

describe('CourseHttpService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [CourseHttpService]
    });
  });

  it('should be created', inject([CourseHttpService], (service: CourseHttpService) => {
    expect(service).toBeTruthy();
  }));
});
