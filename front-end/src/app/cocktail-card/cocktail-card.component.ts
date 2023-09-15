import { Component, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-cocktail-card',
  templateUrl: './cocktail-card.component.html',
  styleUrls: ['./cocktail-card.component.scss']
})

export class CocktailCardComponent  {
  @Input() cocktailName: string = '';
  @Input() cocktailImage: string = '';
  @Input() cocktailTag1: string = '';
  @Input() cocktailTag2: string = '';
  @Input() cocktailTag3: string = '';
}
