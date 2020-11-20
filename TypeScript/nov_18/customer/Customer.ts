export class Customer {
    
    constructor(private _firstName: String, private _lastName: String) { }
    public get lastName(): String {
        return this._lastName;
    }
    public get firstName(): String {
        return this._firstName;
    }
    public set lastName(value: String) {
        this._lastName = value;
    }
    public set firstName(value: String) {
        this._firstName = value;
    }

}