import { Injectable, Inject } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { BASE_URL } from './base-url.value';

interface ParagraphResponse {
  data: string[];
  total: number;
}

@Injectable({
  providedIn: 'root'
})
export class ParagraphService {

  private readonly paragraphUrl = '/paragraph';

  constructor(
    @Inject(BASE_URL) private readonly baseUrl: string,
    private readonly http: HttpClient
    ) { }

  getParagraphs(first: number, count: number): Observable<ParagraphResponse> {
    const params = new HttpParams()
    .set('first', first.toString())
    .set('count', count.toString());

    return this.http.get<ParagraphResponse>(this.baseUrl + this.paragraphUrl, {params});
  }
}
