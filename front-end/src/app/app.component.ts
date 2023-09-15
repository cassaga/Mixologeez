import {Component, OnInit} from '@angular/core';
import {DataService} from "./data.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  data: any;

  constructor(private dataService: DataService) { }

  ngOnInit(): void {
    this.dataService.fetchData('http://localhost:8080/v1/cocktail')
      .subscribe(
        (response) => {
          this.data = response;
          console.log(this.data)
        },
        (error) => {
          console.error('Error fetching data', error);
        }
      );
  }
}

