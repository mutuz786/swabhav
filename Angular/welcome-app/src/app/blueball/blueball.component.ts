import { Component, OnInit } from '@angular/core';
import { IBall } from "./IBall";

@Component({
  selector: 'sw-blueball',
  templateUrl: './blueball.component.html',
  styleUrls: ['./blueball.component.css']
})
export class BlueballComponent {
  balls: IBall[] = new Array();
  hideGame: boolean = true;
  hideResult: boolean = true;
  hideIntro: boolean = false;
  randomNum: number = 0

  start() {
    this.randomNum = Math.floor(Math.random() * 50) + 1;
    for (var i = 0; i < 50; i++) {
      this.balls[i] = { id: i + 1, color: "" };
    }
    this.hideGame = false;
    this.hideIntro = true;
  }
  check(num:number){
    alert(num)
  }
}
