public class  DogFactory extends AnimalFactory{

    @Override
    protected Animal createAnimal() {
        return new Tiger();
    }

    
}
