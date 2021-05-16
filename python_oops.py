#main.py
class XYZ:

    #class attribute
    class_name="XYZ"
    def __init__(self,name,id):
        self.name=name
        self.id=id

    #execute function
    def execute(self,object_name,id):
        print("Attributes of class XYZ are:")
        print("object name:",object_name)
        print("object id:",id)

def main():
    #run the script
    i=1
    while(i>0):
        user_input=input("\nPlease enter name of object(or type 'quit' to exit):")
        if user_input.lower()=='quit':
            print("shutting down!")
            break
        obj_name=user_input
        user_input=XYZ(obj_name,i)
        user_input.execute(obj_name,i)
        del user_input

        i+=1
        
    print("\nThe number of times the same class is invoked:",i)



if __name__=='__main__':
    main()
                      
