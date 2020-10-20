export class People
{
    name:string;
    age:number;
    gender:string;
    constructor()
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

getName()
{
    return this.getName;
}
getAge()
{
    return this.age;
}
getGender()
{
    return this.gender;
}

}

export class Model
{
    newPeople:People[];
    constructor()
    {
        this.newPeople=
        [
            new People("Dia",20,"F"),
            new People("Ria",21,"F"),
            new People("Raj",22,"M"),
        ];
    }
}