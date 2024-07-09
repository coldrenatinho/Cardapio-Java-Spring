
import './App.css'
import { Card } from './componets/card';
import { useFoodData } from './hooks/userFoodData';

function App() {

const { data } = useFoodData();

  return ( 
      <div>
        <header>Cardápio</header>
        <div className='container'>
          <div className="card-grid">
            {data && data.map(foodData =>
              <Card
                price={foodData.price} 
                title={foodData.title} 
                image={foodData.image}
              />
            )}
          </div>
        </div>
      </div>
    )
}

export default App
