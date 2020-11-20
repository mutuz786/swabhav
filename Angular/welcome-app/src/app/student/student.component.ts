import { Component, OnInit } from '@angular/core';
import { IStudent } from './IStudent';
import { promise } from 'protractor';

@Component({
  selector: 'sw-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
  student!: IStudent;
  students: IStudent[] = [];

  constructor() {
  }
  addStudents() {
    this.students = [
      { rollno: 1, name: "murtaza", cgpa: 8.4 },
      { rollno: 2, name: "sagar", cgpa: 7.2 },
      { rollno: 3, name: "gaurav", cgpa: 6.4 },
      { rollno: 4, name: "rahul", cgpa: 7.7 }
    ]
  }
  addStudent() {
    this.student = { rollno: 1, name: "murtaza", cgpa: 8 };
  }

  ngOnInit(): void {
  }

}
