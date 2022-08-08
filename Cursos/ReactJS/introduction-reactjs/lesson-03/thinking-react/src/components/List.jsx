import React from "react";
import PropTypes from 'prop-types';
import { Button } from "./Button";

export const List = ({ customers }) => {
  
  const handleClick = (id) => {
    console.log('Deletar cliente');
    alert(`ID do cliente: ${id}`);
  };

  const renderCustomers = (customer) => {
    return (
      <div key={`customer-${customer.id}`}>
        <li>
          {customer.name}
        </li>
        <Button onClick={
          () => handleClick(customer.id)
        }>Deletar Cliente x</Button>
        {customer.skills.map(renderSkills)}
      </div>
    );
  };

  const renderSkills = (skill, index) => {
    return (
      <div style={{ paddingLeft: '30px' }} key={`skill-${index}`}>
        <li>
          {skill}
        </li>
      </div>
    );
  };

  return (
    <div>
      <ul>
        {customers.map(renderCustomers)}
      </ul>
    </div>
  );
};

List.PropTypes = {
  customers: PropTypes.any,
};
