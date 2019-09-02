import { TestBed } from '@angular/core/testing';

import { ParagraphService } from './paragraph.service';

describe('ParagraphService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ParagraphService = TestBed.get(ParagraphService);
    expect(service).toBeTruthy();
  });
});
