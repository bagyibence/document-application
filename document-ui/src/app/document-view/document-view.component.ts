import { Component, OnInit, ViewChildren, Directive, QueryList, ContentChildren, Inject } from '@angular/core';
import { ParagraphService } from '../paragraph.service';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { LazyLoadEvent } from 'primeng/api';
import { DOCUMENT } from '@angular/common';

@Component({
  selector: 'app-document-view',
  templateUrl: './document-view.component.html',
  styleUrls: ['./document-view.component.css']
})
export class DoumentViewComponent implements OnInit {

  public rows = 100;
  public totalRecords: Observable<number>;
  public paragraphs: Observable<string[]>;

  constructor(
    private readonly paragraphService: ParagraphService,
    @Inject(DOCUMENT) public doc
    ) { }

  ngOnInit() {
    this.totalRecords = this.paragraphService.getParagraphs(0, this.rows).pipe(
      map(res => res.total)
    );
  }

  loadData(event: LazyLoadEvent) {
    const response = this.paragraphService.getParagraphs(event.first, event.rows);

    this.paragraphs = response.pipe(
      map(res => res.data)
    );
  }

}
