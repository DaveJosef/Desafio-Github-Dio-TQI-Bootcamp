import React from 'react';
import PetShop from './PetShop';

export default function App() {

  const handleClick = () => {
    console.log('iniciando o banho...');
  };

  return (
    <PetShop dogs={2} customerName='David' onClick={handleClick} status='done' />
  )
}
