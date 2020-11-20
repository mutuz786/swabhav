function f1() {
    console.log("Iside f1");
}
f1();
var f2 = function () {
    console.log("Inside f2");
};
f2();
setTimeout(function () {
    console.log("After 3 sec");
}, 3000);