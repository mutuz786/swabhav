import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {
  name: String = "murtaza";
  constructor() { }

  ngOnInit(): void {
  }
  change() {
    console.log(this.name)
  }
}
