import React from 'react';

const listCustomer = [
  {
    id: 1,
    name: 'José David',
    skills: ['React', 'Node', 'CSS', 'Webpack']
  },
  {
    id: 2,
    name: 'Aline Carneiro',
    skills: ['HTML', 'React Native', 'Go', 'JS']
  },
  {
    id: 3,
    name: 'Fulano de Tal',
    skills: ['Assembly']
  },
  {
    id: 4,
    name: 'Maria do Carmo',
    skills: ['Reason']
  },
];

export default function App() {
  
  const renderCustomers = (customer) => {
    return (
      <div key={`customer-${customer.id}`}>
        <li>
          {customer.name}
        </li>
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
        {listCustomer.map(renderCustomers)}
      </ul>
    </div>
  );
}
