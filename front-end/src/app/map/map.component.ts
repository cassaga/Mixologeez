import { Component, OnInit, AfterViewInit } from '@angular/core';
import * as L from 'leaflet';

@Component({
  selector: 'app-map',
  templateUrl: './map.component.html',
  styleUrls: ['./map.component.scss']
})
export class MapComponent implements OnInit, AfterViewInit {
  private map!: L.Map;

  ngOnInit() {

  }

  ngAfterViewInit() {
    this.initMap();

    setTimeout(() => {
      this.map.invalidateSize();
    }, 0);
  }

  private initMap(): void {

    this.map = L.map('map', {
      center: [46.603354, 1.888334],
      zoom: 6
    });

    const tiles = L.tileLayer('https://{s}.tile.opentopomap.org/{z}/{x}/{y}.png', {
      maxZoom: 17,
      attribution: 'OpenTopoMap'

    });

    tiles.addTo(this.map);
  }
}
