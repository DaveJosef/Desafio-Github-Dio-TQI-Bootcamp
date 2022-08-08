import React from 'react';

const hasCustomer = false;

export default function App() {

  const renderShowHistory = 
  <div>
    Clique abaixo para visualizar histórico
    <br />
    <button>histórico</button>
  </div>;

  const renderAddCustomer = 
  <div>
    Clique abaixo para cadastrar cliente
    <br />
    <button>cadastrar cliente</button>
  </div>;
  
  const showCustomer = () => {

    if (!hasCustomer) return null;

    return (
      <div>
        <h1>Cliente: José David</h1>
      </div>
    );
  };

  return (
    <div>
      <h1>Conditional Renderization</h1>
      {hasCustomer ? renderShowHistory : renderAddCustomer}
      <div>{showCustomer()}</div>
    </div>
  );
}
