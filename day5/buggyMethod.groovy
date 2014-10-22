String buggyMethod(int n) {
if (n <= 0) {
return "";
}
return n + " " + buggyMethod(n - 2);
}

println buggyMethod(13);