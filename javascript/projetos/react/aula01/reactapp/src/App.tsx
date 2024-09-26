import ListGroup from "./components/ListGroup";
import Alert from "./components/Alert";

function App() {
   const items = [
     "Moscou",
     "Manaus",
     "Pequim",
     "Porto Velho",
     "Havana",
     "Leningrado",
     "Stalingrado",
   ];

   const handleSelectItem = (item: string) => {
     console.log(item);
   }

   return (
    <div>
      <Alert>
        <h3>Aviso</h3>
        <p>avisando...</p>
      </Alert>

       <ListGroup items={items} heading="Cidades" onSelectItem={handleSelectItem} />
     </div>
   );
}

export default App;
