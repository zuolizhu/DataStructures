function User(firstName, lastName, age, gender) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
  this.gender = gender;
};

var user1 = new User('John', 'Doe', 22, 'Male');

User.prototype.emailDomain = '@gmail.com';

User.prototype.getEmailAddress = function() {
  return this.firstName + this.lastName + this.emailDomain;
}
