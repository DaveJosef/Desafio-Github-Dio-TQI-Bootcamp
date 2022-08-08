import React from 'react';
import PropTypes from 'prop-types';

export const Button = ({ children, onClick }) => {
  return (
    <button onClick={onClick}>{children}</button>
  );
};

Button.PropTypes = {
  children: PropTypes.any,
  onClick: PropTypes.func
};
