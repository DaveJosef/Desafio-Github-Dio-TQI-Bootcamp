import React from 'react';
import PropType from 'prop-types';

export default function Button(props) {
    const { children, onClick } = props;

  return (
    <button onClick={ onClick }>{ children }</button>
  )
}

Button.propTypes = {
    onClick: PropType.func.isRequired
};
