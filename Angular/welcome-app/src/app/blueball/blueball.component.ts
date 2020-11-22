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
  randomNum: number = 0;
  turnsLeft: number = 0;
  message: String = "";
  tried: number[] = [];
  gameOver: boolean = false;

  start() {
    this.gameOver = false;
    this.balls = new Array();
    this.randomNum = Math.floor(Math.random() * 50) + 1;
    for (var i = 0; i < 50; i++) {
      this.balls[i] = { id: i + 1, color: "gray" };
    }
    this.turnsLeft = 5;
    this.tried = [];
    this.hideGame = false;
    this.hideIntro = true;
  }
  check(num: number) {
    if (!this.gameOver) {
      if (this.turnsLeft > 0) {
        if (!this.isRepeat(num)) {
          this.turnsLeft--;
          this.tried.push(num);
          if (num < this.randomNum)
            this.balls[num - 1].color = "red";
          else if (num > this.randomNum)
            this.balls[num - 1].color = "green";
          else {
            this.balls[num - 1].color = "blue";
            this.gameOver = true;
            this.showResult("You won the game!!!!");
            return;
          }
          if (this.turnsLeft == 0) {
            this.showResult("you lost the game!!!!")
            return;
          }
        }
      } else {
        this.showResult("you lost the game!!!!")
      }
    }
  }
  showResult(message: String) {
    setTimeout(() => {
      this.hideResult = false;
      this.hideGame = true;
      this.message = message;
    }, 3000);
  }
  restart() {
    this.hideResult = true;
    this.hideIntro = false
  }
  isRepeat(num: number): boolean {
    for (let i of this.tried) {
      if (i == num)
        return true;
    }
    return false;
  }
}
