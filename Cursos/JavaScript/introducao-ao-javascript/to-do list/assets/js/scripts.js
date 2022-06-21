
const tasksForm = document.getElementById('tasks-form');
const tasksFormInput = document.getElementById('new-task');
const taskList = document.getElementById('tasks-list');

// logic
function countTasks() {
    return taskList.children.length;
}

function finishTask(taskId) {
    const taskCheckBox = document.getElementById(taskId);
    const listItem = taskCheckBox.parentElement;
    listItem.classList.remove('done');
    if (taskCheckBox.checked) {
        listItem.classList.add('done');
    }
}

function createTaskLabel(labelName, taskId) {
    let itemLabel = document.createElement('label');
    itemLabel.htmlFor = taskId;
    itemLabel.innerText = labelName;
    return itemLabel;
}

function createTaskCheckBox(taskId) {
    let itemCheck = document.createElement('input');
    itemCheck.type = 'checkbox';
    itemCheck.id = taskId;
    itemCheck.addEventListener('click', () => {finishTask(taskId)});
    return itemCheck;
}

function createTaskItem(itemCheck, itemLabel) {
    let item = document.createElement('li');
    item.appendChild(itemCheck);
    item.appendChild(itemLabel);
    return item;
}

function createTaskElement(taskName) {
    const taskId = `task#${countTasks() + 1}`;
    // checkbox
    let checkBox = createTaskCheckBox(taskId);
    // label
    let taskLabel = createTaskLabel(taskName, taskId);
    //list item
    let item = createTaskItem(checkBox, taskLabel);
    return item;
}

function addTask(event) {
    event.preventDefault();
    newTaskName = tasksFormInput.value;
    if (!newTaskName) throw new Error('Invalid Task Name.');
    newTaskElement = createTaskElement(newTaskName);
    taskList.appendChild(newTaskElement);
    tasksForm.reset();
}

tasksForm.addEventListener('submit', (event) => {addTask(event)});

// some example tasks
taskList.appendChild(createTaskElement('Estudar React'));
taskList.appendChild(createTaskElement('Estudar JavaScript'));
