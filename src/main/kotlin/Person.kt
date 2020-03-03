class Person() {
    var action: PersonAction = PersonAction.WALK
    //get() = PersonAction.RUN // overriting with the get
    set(value){
       field = PersonAction.RUN
    }


}