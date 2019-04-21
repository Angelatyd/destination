var countryList = Array();
countryList[0] = "Spain";
countryList[1] = "Japan";
console.log(countryList);

function cal(a,b){
    var c = a*b;
    return c;
}

function Student(name,age){
    this.name = name;
    this.age = age;
    this.study = function(prefer){
        console.log("She "+prefer+" studying.")
    }
}
var student1 = new Student("Anne",16);
student1.study("dislikes");

function Student1(){}
Student1.prototype.name = "Anne";
Student1.prototype.age = 16;
Student1.prototype.study = function(prefer){
    console.log("She "+prefer+" studying.")
}
var student2 = new Student1();
student2.study("likes");

var document = new Document();
var list = document.getElementsByTagName("*");
console.log(list.length);

function showPic(whichPic){
    var source = whichPic.getAttribute("href");
    var gallery = document.getElementById("gallery");
    gallery.setAttribute("src",source);
    var description = whichPic.getAttribute("title");
    var sentence = document.getElementById("sentence");
    sentence.firstChild.nodeValue = description;
}

countryList.sort();