export class Model {
  user;
  items;
  contact;

  constructor() {
    this.user = "Shrilata";
    this.contact = {
      email: "shrilata@gmail.com",
      phone: 9977886600
    };
    this.items = [new TodoItem("Buy Flowers", false),
                  new TodoItem("Get laundry", false),
                  new TodoItem("Collect Tickets", false),
                  new TodoItem("Call Mom", false)]
  }
}

export class TodoItem {
  action;
  done;
  constructor(action, done) {
    this.action = action;
    this.done = done;
  }
}